String capitalizeName(String? name) {
  if (name != null) {
    return name.toUpperCase();
  }
  return 'NONE';
}

String capitalizeName2(String? name) =>
    name != null ? name.toUpperCase() : 'NONE';

String capitalizeName3(String? name) => name?.toUpperCase() ?? 'NONE';

// 위 세 function 모두 같은 내용이다.
void main(List<String> args) {
  capitalizeName('potato');
  capitalizeName(null);

  String? name;
  name ??= 'potato'; // null일 경우 potato
  print(name);
  name = null;
  name ??= 'another'; // null일 경우 another
  print(name);
}
