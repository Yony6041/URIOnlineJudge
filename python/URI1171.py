import time
start_time = time.time()

def find(list,b):
    c = 0
    for i in range(len(list)):
        if b == list[i]:
            c += 1
    e = str(b) + " aparece " + str(c) + " vez(es)"
    if e not in unique:
        unique.append(e)
def aux(d):
    for i in range(d):
        find(mList,mList[i])
    for i in range(len(unique)):
        print(unique[i])

a = int(input())
mList = []
unique=[]
for i in range(a):
    mList.append(int(input()))
mList.sort()
aux(len(mList))

print("My program took", time.time() - start_time, "to run")
