// typedef는 좀 더 간단한 데이터의 alias를 만들 때 사용한다.

typedef ListOfInts = List<int>;

List<int> reverseListOfNumbers(List<int> list) {
  var reversed = list.reversed;
  return reversed.toList();
}

ListOfInts reverseListOfNumbers2(ListOfInts list) {
  var reversed = list.reversed;
  return reversed.toList();
}

// 둘 다 같은 자료형이다.

typedef UserInfo = Map<String, String>;

String sayHi(Map<String, String> userInfo) {
  return "Hi, ${userInfo['name']}";
}

String sayHi2(UserInfo userInfo) {
  return "Hi, ${userInfo['name']}";
}

void main(List<String> args) {
  print(reverseListOfNumbers([1, 2, 3]));
  print(reverseListOfNumbers2([1, 2, 3]));

  print(sayHi({"name": 'potato'}));
  print(sayHi2({"none": 'none'})); //name이 아니여도 오류가 발생하진 않는다.
}
