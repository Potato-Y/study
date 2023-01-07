void main(List<String> args) {
  var numbers = [1, 2, 3, 4];
  List<int> numbers2 = [1, 2, 3, 4]; // 둘 모두 동일하다.

  // numbers.add('1'); // 불가
  numbers.add(1); // 가능

  var giveMeFive = true;
  var numbers3 = [
    1,
    2,
    3,
    4,
    if (giveMeFive) 5, // giveMeFive에 따라 5가 들어감
    // collection if
  ];
}
