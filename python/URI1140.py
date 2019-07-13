def check(list):
    charr = list[0]
    flag = True
    for i in range(len(list)):
        if charr != list[i]:
            flag = False
    if flag == True:
        return "Y\n"
    else:
        return "N\n"

s = input()
ss = ""
while (s != "*"):
    l = s.split(" ")
    mList = []
    for i in range(len(l)):
        mList.append((l[i][0]).lower())
    ss += check(mList)
    s = input()
print(ss)
