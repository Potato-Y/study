void main(List<String> args) {
  var name = '감자'; // 변수의 타입이 자동으로 지정
  // name = 1; // 그러나 다른 타입으로 업데이트 할 수 없음
  name = 'Potato'; // 같은 타입으로만 업데이트 가능

  // 타입을 직접 선언
  String name2 = '감자';
  name2 = 'Potato';
}

// 관습적으로 함수나 메소드 내부에 지역 변수르 ㄹ선언할 때는 var를 사용
// class에서 변수 혹은 property를 선언할 때는 타입을 지정
