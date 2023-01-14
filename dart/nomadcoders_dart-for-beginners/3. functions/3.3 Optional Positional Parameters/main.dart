String sayHello(String name, int age, [String? country = 'none']) =>
    'Hello $name, you are $age years old from $country';

void main(List<String> args) {
  print(sayHello(
    'potato',
    12,
  ));
}

// positional parameter를 사용하며 args를 일부만 받기