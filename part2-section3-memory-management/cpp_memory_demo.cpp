#include <iostream>
using namespace std;

int main() {
    int* data = new int[10000000];
    cout << "Memory allocated" << endl;

    delete[] data;
    cout << "Memory freed" << endl;
    return 0;
}
