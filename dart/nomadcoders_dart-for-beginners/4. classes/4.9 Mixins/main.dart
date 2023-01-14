// Mixin은 생성자가 없는 클래스를 의미한다.
// 클래스에 프로퍼티들을 추가하거나 할 때 사용한다.

class Strong {
  final double strengthLevel = 1500.99;
}

class QuickRunner {
  void runQuick() {
    print('run!');
  }
}

class Tall {
  final double height = 1.99;
}

enum Team { red, blue }

class Player with Strong, QuickRunner, Tall {
  final Team team;

  Player({required this.team});
}

class Horse with Strong, QuickRunner {}

class Kid with QuickRunner {}

void main(List<String> args) {
  var player = Player(
    team: Team.red,
  );
  player.runQuick();
}
