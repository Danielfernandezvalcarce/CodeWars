def correct(s):
    nn=""
    for i in s:
        if i == "5":
            i="S"
            nn=nn+i
        elif i == "0":
            i="O"
            nn=nn+i
        elif i=="1":
            i="I"
            nn=nn+i
        else:
            nn=nn+i
    return nn