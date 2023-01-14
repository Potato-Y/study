class Player {
  final String name;
  int xp;
  String team;
  int age;

  Player({
    required this.name,
    required this.xp,
    required this.team,
    required this.age,
  });

  Player.createBluePlayer({
    required String name,
    required int age,
  })  : this.age = age,
        this.name = name,
        this.team = 'blue',
        this.xp = 0;

  Player.createRedPlayer({
    required String name,
    required int age,
  })  : this.age = age,
        this.name = name,
        this.team = 'red',
        this.xp = 0;

  void sayHello() {
    print('Hi my name is $name');
  }
}

void main(List<String> args) {
  var player = Player.createBluePlayer(name: 'potato', age: 12);
  var player2 = Player.createRedPlayer(name: 'potato2', age: 12);
}
