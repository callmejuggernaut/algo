#include "iostream"

using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;

    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {

public:
    Solution() {};

    int acc = 0;

    int rangeSumBST(TreeNode* root, int L, int R) {
        dfs(root, L, R);

        return acc;
    };

    void dfs(TreeNode* node, int L, int R) {
        if (node == NULL)
            return;
        if (L <= node->val && node->val <= R)
            acc += node->val;
        if (node->val > L)
            dfs(node->left, L, R);
        if (node->val < R)
            dfs(node->right, L, R);
    }
};

int main() {
    auto r10 = new TreeNode(10);
    auto r5 = new TreeNode(5);
    auto r15 = new TreeNode(15);
    auto r3 = new TreeNode(3);
    auto r7 = new TreeNode(7);
    auto r18 = new TreeNode(18);

    r10->left = r5;
    r10->right = r15;
    r5->left = r3;
    r5->right = r7;
    r15->right = r18;

    auto solution = new Solution();

    cout << solution->rangeSumBST(r10, 7, 15) << endl;

    return 0;
}