class George:
    bool = True
    def setter(self,bool):
        self.bool = bool
    def getter(self):
        return self.bool
    def __init__(self,bool):
        self.bool = bool
args = []
line = input()

while line != "":
    args.append(line)
    line = input()
for i in range(len(args)):
    for j in range(len(args[i])):
           
