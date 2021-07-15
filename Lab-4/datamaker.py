for l in range(0,5):
    lis = []
    for x in range(5 * l, 5 * l + 5):
        lis.append(str(x + 1))
    print(",".join(lis))
