enum Team { red, blue }

class Player {
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
}

void main(List<String> args) {
  var potato = Player(name: 'Potato', xp: 1200, team: Team.red)
    ..team = Team.blue;
}
