class Solution:
    def smallestNumber(self, num, t):

        def gcd(a, b):
            while b != 0:
                a, b = b, a % b
            return a

        temp = t

        for i in range(2, 10):
            while temp % i == 0:
                temp //= i

        if temp > 1:
            return "-1"

        n = len(num)

        rem = [0] * (n + 1)
        rem[0] = t

        pos = n - 1

        num_chars = list(num)

        for i in range(n):

            if num_chars[i] == '0':
                pos = i
                break

            rem[i + 1] = rem[i] // gcd(rem[i], int(num_chars[i]))


        if rem[n] == 1:
            return num


        for i in range(pos, -1, -1):

            while True:

                num_chars[i] = chr(ord(num_chars[i]) + 1)

                if num_chars[i] > '9':
                    break

                t_now = rem[i] // gcd(rem[i], int(num_chars[i]))

                k = 9

                for j in range(n - 1, i, -1):

                    while t_now % k != 0:
                        k -= 1

                    t_now //= k
                    num_chars[j] = str(k)


                if t_now == 1:
                    return "".join(num_chars)


        ans = []

        original_t = t

        for i in range(9, 1, -1):

            while original_t % i == 0:
                ans.append(str(i))
                original_t //= i


        padding = max(n + 1 - len(ans), 0)

        for _ in range(padding):
            ans.append('1')


        ans.reverse()

        return "".join(ans)