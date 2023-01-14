class Player {
  String name;
  int xp;
  String team;

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
  var potato = Player(
    name: 'Potato',
    xp: 1200,
    team: 'red',
  );
  potato.name = 'potato2';
  potato.xp = 120000;
  potato.team = 'blue';

  // 위 아래 모두 동일한 내용이다.
  var potato2 = Player(
    name: 'Potato',
    xp: 1200,
    team: 'red',
  )
    ..name = 'potato2'
    ..xp = 120000
    ..team = 'blue';
}
