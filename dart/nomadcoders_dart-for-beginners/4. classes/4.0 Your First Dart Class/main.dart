class Player {
  String name = 'potato'; //만약 이름이 바뀌지 않게 하려면 final을 추가한다.
  int xp = 1500;

  void sayHello() {
    print('Hi my name is $name');
  }
}

void main(List<String> args) {
  var player = Player();
  print(player.name);
  player.name = 'potato2';
  print(player.name);
  player.sayHello();
}
