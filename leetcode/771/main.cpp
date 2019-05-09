#include <iostream>
#include <algorithm>
#include <unordered_set>


using namespace std;

int numJewelsInStones(string J, string S) {
    unordered_set<char> jewels(J.begin(), J.end());
    for (auto jewel : J) {
        jewels.insert(jewel);
    }

    int count = 0;
    for (auto stone : S) {
        if (jewels.count(stone)) {
            count++;
        }
    }

    return count;
}

int main() {
    string j, s;
    cin >> j >> s;

    cout << numJewelsInStones(j, s) << endl;
    return 0;
}