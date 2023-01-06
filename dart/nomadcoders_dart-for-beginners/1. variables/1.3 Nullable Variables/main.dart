void main(List<String> args) {
  String name = 'potato';
  name = null; // 오직 string만 가능하기 때문에 null이 불가함.

  String? name2 =
      'potato'; // null을 포함하려면 ?를 붙여준다. 그러면 컴파일러가 null이 가능하다는 것을 알고 있게 된다.
  name2 = null;

  name2.length; // 바로 길이를 확인하려고 하면 null 일 수도 있다고 알려준다.

  if (name2 != null) {
    name2.isNotEmpty; // null이 아님을 확인한 후에는 오류를 반환하지 않는다.
  }

  // 혹은
  name2?.isNotEmpty; // 이와 같이 사용할 수도 있다.
}
