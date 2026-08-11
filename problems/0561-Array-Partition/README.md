<div align="center">

# 561. Array Partition

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/Language-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e&logo=code)  ![Solutions](https://img.shields.io/badge/Solutions-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/Date-2026-08-11-0984e3?style=for-the-badge&labelColor=1a1a2e)

[![LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/array-partition/)

</div>

---

## 🏷️ Topics

`Array` `Greedy` `Sorting` `Counting Sort`

## 🏆 Best Performance

| Metric | This Attempt | All-time Best |
|--------|:-----------:|:------------:|
| ⚡ Runtime | 17 ms (Beats 81%) | **17 ms (Beats 81%)** 🆕 |
| 💾 Memory  | 49.5 MB (Beats 87%) | **49.5 MB (Beats 87%)** |

> 🎉 **New personal best!** Runtime improved!

## 💡 Solutions (1 total)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-08-11 ← **latest** |

---

## 📋 Problem Description

Given an integer array `nums` of `2n` integers, group these integers into `n` pairs `(a_1, b_1), (a_2, b_2), ..., (a_n, b_n)` such that the sum of `min(a_i, b_i)` for all `i` is **maximized**. Return* the maximized sum*.

 

**Example 1:**

```

**Input:** nums = [1,4,3,2]
**Output:** 4
**Explanation:** All possible pairings (ignoring the ordering of elements) are:
1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
So the maximum possible sum is 4.
```

**Example 2:**

```

**Input:** nums = [6,2,6,5,1,2]
**Output:** 9
**Explanation:** The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.

```

 

**Constraints:**

	- `1 <= n <= 10^4`

	- `nums.length == 2 * n`

	- `-10^4 <= nums[i] <= 10^4`

---

<p align="right">
  <sub>🤖 Auto-pushed by <a href="https://deveshsamant.in/">Devesh Samant</a>'s <strong>LeetSync</strong> extension</sub>
</p>
