def selection_sort(list):
    new_list = list.copy()
    size = len(new_list)

    for step in range(size):
        min_idx = step
        for i in range(step + 1, size):
            if (new_list[i] < new_list[min_idx]):
                min_idx = i

        (new_list[step], new_list[min_idx]) = (
            new_list[min_idx], new_list[step])
    return new_list


list_of_number = [5, 2, 8, 15, 23, 34, 85, 21, 3, 63, 13, 19]
print(
    "Unsorted list: \t",
    list_of_number,
    "\nSorted list: \t",
    selection_sort(list_of_number)
)
