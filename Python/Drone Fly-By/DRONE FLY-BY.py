def fly_by(lamps, drone):
    i = 0
    x = 0
    on = ""
    for i in range (0,len(drone)-1):
        i = i + 1
    for j in lamps:
        if j == "x" and x<=i:
            on = on + "o"
            x = x + 1
        else:
            on = on + "x"
    return on