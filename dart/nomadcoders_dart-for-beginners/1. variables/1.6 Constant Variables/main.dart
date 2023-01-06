void main(List<String> args) {
  // js const = dart final
  // dart const는 compile-time constant를 만들어준다.

  const name = 'potato';
  name = '12'; // final과 같이 수정은 안된다.

  // 중요한 건, const는 compile-time에 알고 있는 값이어야 한다.

  const API = '123123'; // 이 값은 절대 바뀌지 않고, 컴파일이 될 때 값을 알고 있다. (하드 코딩)
  const API2 = fetchApi(); // 이건 compile-time constant가 아니다. 컴파일은 API의 값을 모른다.
  // 위 경우 final혹은 var이 맞다.

  // 즉, 앱스토어에 올리기 전에 알고 있는 값.
}
