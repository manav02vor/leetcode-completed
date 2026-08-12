<div align="center">

# 3074. Apple Redistribution into Boxes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=for-the-badge&labelColor=1a1a2e)  ![Language](https://img.shields.io/badge/Language-Java-6c5ce7?style=for-the-badge&labelColor=1a1a2e&logo=code)  ![Solutions](https://img.shields.io/badge/Solutions-1-6c5ce7?style=for-the-badge&labelColor=1a1a2e)  ![Date](https://img.shields.io/badge/Date-2026-08-12-0984e3?style=for-the-badge&labelColor=1a1a2e)

[![LeetCode](https://img.shields.io/badge/View%20on-LeetCode-ffa116?style=flat-square&logo=leetcode&logoColor=ffa116)](https://leetcode.com/problems/apple-redistribution-into-boxes/)

</div>

---

## 🏷️ Topics

`Array` `Greedy` `Sorting`

## 🏆 Best Performance

| Metric | This Attempt | All-time Best |
|--------|:-----------:|:------------:|
| ⚡ Runtime | 5 ms (Beats 32%) | **5 ms (Beats 32%)** 🆕 |
| 💾 Memory  | 44.5 MB (Beats 44%) | **44.5 MB (Beats 44%)** |

> 🎉 **New personal best!** Runtime improved!

## 💡 Solutions (1 total)

| # | File | Language | Date |
|:-:|------|:--------:|:----:|
| 1 | [sol1.java](./sol1.java) | `Java` | 2026-08-12 ← **latest** |

---

## 📋 Problem Description

You are given an array `apple` of size `n` and an array `capacity` of size `m`.

There are `n` packs where the `i^th` pack contains `apple[i]` apples. There are `m` boxes as well, and the `i^th` box has a capacity of `capacity[i]` apples.

Return *the **minimum** number of boxes you need to select to redistribute these *`n`* packs of apples into boxes*.

**Note** that, apples from the same pack can be distributed into different boxes.

 

**Example 1:**

```

**Input:** apple = [1,3,2], capacity = [4,3,1,5,2]
**Output:** 2
**Explanation:** We will use boxes with capacities 4 and 5.
It is possible to distribute the apples as the total capacity is greater than or equal to the total number of apples.

```

**Example 2:**

```

**Input:** apple = [5,5,5], capacity = [2,4,2,7]
**Output:** 4
**Explanation:** We will need to use all the boxes.

```

 

**Constraints:**

	- `1 <= n == apple.length <= 50`

	- `1 <= m == capacity.length <= 50`

	- `1 <= apple[i], capacity[i] <= 50`

	- The input is generated such that it's possible to redistribute packs of apples into boxes.

---

<p align="right">
  <sub>🤖 Auto-pushed by <a href="https://deveshsamant.in/">Devesh Samant</a>'s <strong>LeetSync</strong> extension</sub>
</p>
