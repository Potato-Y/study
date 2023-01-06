void main(List<String> args) {
  late final String name;
  // do something, go to api

  print(name); // 데이터를 넣기 전에는 오류를 반환한다.
  name = 'potato';
  print(name);

  // 데이터 없이 변수를 만들어주고, 나중에 데이터를 받아서 넣어준다.
  // 단 final 이 붙어있기 때문에 한 번만 할당할 수 있다.
  name = 'potato';
}
