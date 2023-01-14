class Player {
  late final String name;
  late int xp;

  Player(String name, int xp) {
    this.name = name;
    this.xp = xp;
  }

  void sayHello() {
    print('Hi my name is $name');
  }
}

class Player2 {
  final String name;
  int xp;

  Player2(this.name, this.xp);

  void sayHello() {
    print('Hi my name is $name');
  }
}

// 두 클래스 모두 동일하다.

void main(List<String> args) {
  var player = Player('potato', 1500);
  player.sayHello();
  var player2 = Player2('potato2', 2500);
  player2.sayHello();
}
