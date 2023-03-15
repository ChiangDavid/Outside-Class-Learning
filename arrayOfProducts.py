#Time: O(n^2), space: O(n)
def arrayOfProducts(array):
    # Write your code here.
    current = 0
    result = []
    while current < len(array):
        product = 1
        for i in range(len(array)):
            if array[i] != array[current] or current != i:
                product *= array[i]
        result.append(product)
        current += 1
    return result
    pass
