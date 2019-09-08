test_cases = int(input())
cases = []

while test_cases != 0:
    cases.append(raw_input())
    test_cases -= 1

for i in range(0, len(cases)):
    ranges = cases[i].split()
    low = int(ranges[0])
    high = int(ranges[1])
    interesting_score = 0
    while low <= high:
        alice_score = 0
        bob_score = 0
        if low % 2 == 0:
            bob_score += 1
        else:
            alice_score += 1
        for j in range(1, (low + 1) / 2):
            if low % j == 0:
                if j % 2 == 0:
                    bob_score += 1
                else:
                    alice_score += 1
        if abs(alice_score - bob_score) <= 2:
            interesting_score += 1
        low += 1
    print "Case #{}: {}".format(i + 1, interesting_score)
