package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    for (i <- 1 to array.length - 1) {
      var res = array(i)
      var j = i - 1
      while (j >= 0 && array(j) > res) {
        array(j + 1) = array(j)
        j = j - 1

      }
      array(j + 1) = res


    }
    return array

  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    for (i <- 0 to array.length - 1) {
      var input = i
      for (j <- i + 1 to array.length) {
        if (array(j) < array(input)) {
          input = j
        }
        val temp = input
        input = array(i)
        array(i) = temp

      }
    }
    return array
  }

  def bubbleSort(array: Array[Int]): Array[Int] = {
    for (i <- 0 to array.length - 1) {
      for (j <- 0 to array.length - i - 1) {
        if (array(j) > array(j + 1)) {
          val temp = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
        }
      }
    }
    return array

  }

}
