void main(List<String> args) {
  var numbers = {1, 2, 3, 4};
  Set<int> numbers2 = {1, 2, 3, 4};
  // 둘이 같다.

  // Set과 List의 차이는
  // Set에 속한 모든 아이템들은 유니크하다.

  numbers.add(1);
  numbers.add(1);
  numbers.add(1);

  print(numbers);

  List numbers3 = [1, 2, 3, 4];
  numbers3.add(1);
  numbers3.add(1);
  numbers3.add(1);

  print(numbers3);
}
