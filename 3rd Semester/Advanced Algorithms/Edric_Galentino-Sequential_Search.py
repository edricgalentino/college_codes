def sequentialSearch(listOfNumber, item):

    index = 0
    isFound = False

    while index < len(listOfNumber):
        if listOfNumber[index] == item:
            isFound = True
            return isFound, index
        else:
            index = index + 1

    return isFound, index


print(sequentialSearch([11, 23, 58, 31, 56, 77, 43, 12, 65, 19], 31))


def printColumn(names):
    num = 9
    for i in range(num):
        print(
            f"('A00{i + 2}', '{names[i]}', 'Jl.Namer', 'Pria', '08213131289', '321707937219391312'), ")


printColumn(['Galentino', 'Aldi', 'Rizky', 'Rizal',
             'Ahmad', 'Rizky', 'Rizal', 'Ahmad', 'Rizky'])
