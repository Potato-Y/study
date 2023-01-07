void main(List<String> args) {
  var oldFriends = ['Potato', 'Apple'];
  var newFriends = [
    'lewis',
    'ralph',
    'darren',
    for (var friend in oldFriends) "🌟 $friend",
  ];

  print(newFriends);
}
