String sayHello(String name, int age, String country) {
  return "Hello $name, you are $age, and you come from $country";
}

//name argument
String sayHello2({
  String name = "n",
  int age = 0,
  String country = 'n',
}) {
  // null을 주의하여 기본 값을 추가
  return "Hello $name, you are $age, and you come from $country";
}

String sayHello3({
  required String name,
  required int age,
  required String country,
}) {
  // 값을 꼭 받도록 설정
  return "Hello $name, you are $age, and you come from $country";
}

void main(List<String> args) {
  print(sayHello('Potato', 11, 'Korea'));

  // name argument
  print(sayHello2(country: 'no', age: 11));
  print(sayHello3(name: 'name', age: 0, country: 'country'));
}
