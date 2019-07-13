num = int(input())
s = ""

def aux(str1,str2):
    a = list(str1)
    b = list(str2)
    dif = len(a) - len(b)
    end = ""
    for i in range(len(b)):
        end +=  a[dif]
        dif += 1
    if end == str2:
        return True
    else:
        return False

for i in range(num):
    string = str(input())
    masterList = string.split()
    a = masterList[0]
    b = masterList[1]
    if len(a) < len(b):
        s += "nao encaixa\n"
    elif aux(a,b):
        s += "encaixa\n"
    else:
        s += "nao encaixa\n"
print(s, end = '')
