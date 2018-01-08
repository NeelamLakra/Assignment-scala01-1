package edu.knoldus

class Searching {

  def lineaSearch(array: Array[Int], elem: Int): Boolean = {
    for (i <- 0 to  array.length - 1) {
      if (array(i) == elem)
        return true
    }
    return false
  }



  def binarySearch(array_1 : Array[Int], right: Int, left: Int, number: Int): Boolean = {
    array_1.sorted
    if (right >= left)
    {
      val mid =  left + (right - left) / 2
      if(array_1(mid) == number)
      {
        return true
      }
      if(array_1(mid) > number)
      {
        return binarySearch(array_1: Array[Int],left: Int, mid-1: Int, number: Int )
      }
      return binarySearch(array_1: Array[Int],mid+1: Int,right: Int, number: Int)
    }
    return false
  }

}
