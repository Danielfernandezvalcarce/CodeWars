def bumps(road):
    contador = 0
    for i in road:
        if i == "n":
            contador = contador + 1
    if contador <= 15:
        return "Woohoo!"
    else:
        return "Car Dead"