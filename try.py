def sod(n):
    s=0
    while(n>0):
        rem=n%10
        s=s+rem
        n=n//10
        if n==0:
            if len(str(s))>1:
                n=s
                s=0
            else:
                break
    return s
print(sod(int(input("Enter a number"))))
