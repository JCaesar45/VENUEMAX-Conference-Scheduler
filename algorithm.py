def max_non_overlapping(bookings):
    if not bookings:
        return 0
    bookings = sorted(bookings, key=lambda x: x[1])
    count = 0
    last_end = -1
    for start, end in bookings:
        if start >= last_end:
            count += 1
            last_end = end
    return count


if __name__ == "__main__":
    print(max_non_overlapping([[1, 4], [2, 5], [5, 7], [3, 6], [8, 10]]))
    print(max_non_overlapping([[0, 2], [1, 3], [2, 4], [3, 5]]))
    print(max_non_overlapping([[1, 2], [1, 3], [2, 3]]))
    print(max_non_overlapping([[5, 10], [1, 3], [4, 6], [7, 9]]))
    print(max_non_overlapping([[0, 1000000]]))
