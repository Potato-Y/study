#include <iostream>

int main() {
	int num = 20;
	std::cout << "Hello World!" << std::endl;
	std::cout << "Hello " << "World!" << std::endl;
	std::cout << num << ' ' << 'A';
	std::cout << std::endl <<  3.14 << std::endl;

	//std::cout => C언어의 stdout
	//std::endl => \n


	//데이터 입력
	int val1;
	std::cout << "첫번째 정수 입력 : ";
	std::cin >> val1;  //std::cin => C언어의 stdin

	int val2;
	std::cout << "두번째 정수 입력 : ";
	std::cin >> val2;

	int result = val1 + val2;
	std::cout << "합 = " << result << std::endl;
	std::cout << "합 = " << val1 + val2 << std::endl;


	system("pause");
	return 0;
}