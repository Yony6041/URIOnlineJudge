lines = int(input())
leds = 0
s = ""
dict = {1:2, 2:5, 3:5, 4:4, 5:5, 6:6, 7:3, 8:7, 9:6, 0:6}
for i in range(lines):
    nums = input()
    mList = list(nums)
    for a in range(len(mList)):
        leds += dict[int(mList[a])]
    s += str(leds) + " leds\n"
    leds = 0
print(s, end='')
