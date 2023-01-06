void main(List<String> args) {
  var name; // dynamic의 타입을 가지고 있음
  // 혹은 dynamic name;
  name = 'potato';
  name = 12;
  name = true;
  // dynamic의 타입이기 때문에 다양한 변수를 넣을 수 있음

  if (name is String) {
    // name.
  }
  if (name is int) {
    // name.
  }

  // 타입을 확인한 후에는 다양한 기능들을 사용할 수 있다.
}
