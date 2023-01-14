class Player {
  final String name;
  int xp;
  String team;
  int age;

  Player(this.name, this.xp, this.team, this.age);

  void sayHello() {
    print('Hi my name is $name');
  }
}

class Player2 {
  final String name;
  int xp;
  String team;
  int age;

  Player2({
    required this.name,
    required this.xp,
    required this.team,
    required this.age,
  });

  void sayHello() {
    print('Hi my name is $name');
  }
}

void main(List<String> args) {
  var player = Player('potato', 1500, 'red', 12);
  player.sayHello();
  var player2 = Player('potato2', 2500, 'blue', 12);
  player.sayHello();

  var player3 = Player2(
    name: 'potato',
    xp: 1500,
    team: 'red',
    age: 12,
  );
  var player4 = Player2(
    name: 'potato2',
    xp: 2500,
    team: 'blue',
    age: 12,
  );
}
