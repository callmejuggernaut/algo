#include <iostream>
#include <vector>
#include <string>

using namespace std;

//string removeOuterParentheses(string s) {
//    string result;
//
//    int i = 0;
//    while (i < s.length()) {
//        if (s[i] == '(') {
//            int numOfOpened = 0;
//            int numOfClosed = 0;
//
//            for (int j = i + 1; j < s.length(); j++) {
//                if(s[j] == ')' && numOfOpened == numOfClosed) {
//                    result += s.substr(i + 1, j - i - 1);
//
//                    i = j + 1;
//                    break;
//                }
//
//                if (s[j] == '(') {
//                    numOfOpened++;
//                } else {
//                    numOfClosed++;
//                }
//            }
//
//            if (i + 1 > s.length()) {
//                break;
//            }
//        } else {
//            break;
//        }
//    }
//
//    return result;
//}

string removeOuterParentheses(string s) {
    int count = 0;
    string result;

    for (char c : s) {
        if (c == '(') {
            if (count) {
                result += c;
            }

            count++;
        } else {
            count--;

            if (count) {
                result += c;
            }
        }
    }

    return result;
}

int main() {
    cout << removeOuterParentheses("(()())(())(()(()))");
    return 0;
}