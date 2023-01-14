void sayHello(String name) {
  // void 이기 때문에 반환하는 것이 없음
  print("Hello $name nice to meet you!");
}

String sayHello2(String name) {
  return "Hello $name nice to meet you!";
}

// fat arrow syntax
String sayHello3(String name) => "Hello $name nice to meet you!";

void main(List<String> args) {
  print(sayHello2('potato'));
  print(sayHello3('potato'));
}
