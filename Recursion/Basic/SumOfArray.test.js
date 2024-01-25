

import sumOfArray from './SumOfArray';

describe('sumOfArray', () => {
  it('should return the correct sum of an array', () => {
    // Arrange
    const arr = [1, 2, 3, 4, 5];
    const n = arr.length - 1;

    // Act
    const result = sumOfArray(arr, n);

    // Assert
    expect(result).toBe(15); // The sum of [1, 2, 3, 4, 5] is 15
  });

  it('should return the first element when the array has only one element', () => {
    // Arrange
    const arr = [10];

    // Act
    const result = sumOfArray(arr, 0);

    // Assert
    expect(result).toBe(10); // The sum of [10] is 10
  });

  it('should return 0 when the array is empty', () => {
    // Arrange
    const arr = [];

    // Act
    const result = sumOfArray(arr, 0);

    // Assert
    expect(result).toBe(0); // The sum of an empty array is 0
  });

  // Add more test cases as needed to cover different scenarios
});
