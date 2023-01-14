class Player {
  final String name;
  int xp;
  String team;

  Player.fromJson(Map<String, dynamic> playerJson)
      : name = playerJson['name'],
        xp = playerJson['xp'],
        team = playerJson['team'];

  void sayHello() {
    print("Hi my name is $name");
  }
}

void main(List<String> args) {
  var apiData = [
    {
      "name": "potato",
      "team": "red",
      "xp": 0,
    },
    {
      "name": "potato2",
      "team": "blue",
      "xp": 0,
    },
    {
      "name": "potato3",
      "team": "red",
      "xp": 0,
    },
  ];

  apiData.forEach((playerJson) {
    var player = Player.fromJson(playerJson);
    player.sayHello();
  });
}
