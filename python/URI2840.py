str = input()
list = str.split()
radius = int(list[0])
liters = int(list[1])

def volumeSphere(radius):
    v = (4*3.1415*radius**3)/3
    return v
volumeSphere(radius)
def division(a,b):
    print(int(a/b))

division(liters,volumeSphere(radius))
