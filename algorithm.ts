function maxNonOverlapping(bookings: number[][]): number {
    if (bookings.length === 0) return 0;
    const sorted = [...bookings].sort((a, b) => a[1] - b[1]);
    let count = 0;
    let lastEnd = -1;
    for (const [start, end] of sorted) {
        if (start >= lastEnd) {
            count++;
            lastEnd = end;
        }
    }
    return count;
}

console.log(maxNonOverlapping([[1, 4], [2, 5], [5, 7], [3, 6], [8, 10]]));
console.log(maxNonOverlapping([[0, 2], [1, 3], [2, 4], [3, 5]]));
console.log(maxNonOverlapping([[1, 2], [1, 3], [2, 3]]));
console.log(maxNonOverlapping([[5, 10], [1, 3], [4, 6], [7, 9]]));
console.log(maxNonOverlapping([[0, 1000000]]));
