abstract class Human {
  // 추상화 클래스는 특정 메소드를 구현하도록 강제화 한다.
  void walk();
}

enum Team { red, blue }

class Player extends Human {
  String name;
  int xp;
  Team team;

  Player({
    required this.name,
    required this.xp,
    required this.team,
  });

  void sayHello() {
    print('Hi my name is $name');
  }

  void walk() {
    print('im walking');
  }
}

void main(List<String> args) {
  var potato = Player(name: 'Potato', xp: 1200, team: Team.red)
    ..team = Team.blue;
}
