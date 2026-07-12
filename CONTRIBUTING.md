# Contributing to NGO Project

Thank you for contributing to the NGO Project!

Follow the steps below to contribute successfully.

---

# Prerequisites

Install Git:
https://git-scm.com/downloads

Verify installation:

```bash
git --version
```

---

# Step 1: Configure Git (First Time Only)

Set your GitHub username:

```bash
git config --global user.name "Your Name"
```

Set your GitHub email:

```bash
git config --global user.email "your-email@example.com"
```

Verify configuration:

```bash
git config --global --list
```

Check username:

```bash
git config --global user.name
```

Check email:

```bash
git config --global user.email
```

---

# Step 2: Clone the Repository

```bash
git clone https://github.com/1dt24cs248/NGO.git
```

---

# Step 3: Move into Project Folder

```bash
cd NGO
```

---

# Step 4: Check Current Branch

```bash
git branch
```

Current branch:

```text
* main
```

---

# Step 5: Check Repository Status

```bash
git status
```

---

# Step 6: Download Latest Changes

Always update before starting work.

```bash
git pull origin main
```

or

```bash
git pull --rebase origin main
```

---

# Step 7: Create a New Branch

```bash
git checkout -b feature-name
```

Example:

```bash
git checkout -b donation-page
```

---

# Step 8: Switch Branches

```bash
git checkout main
```

or

```bash
git switch main
```

---

# Step 9: Make Changes

Edit the project files.

Example:

- index.html
- apply.html
- theme.css

Save the files.

---

# Step 10: Check Modified Files

```bash
git status
```

---

# Step 11: Add Changes

Add all files:

```bash
git add .
```

Add a specific file:

```bash
git add apply.html
```

---

# Step 12: Commit Changes

```bash
git commit -m "Added apply page"
```

Example:

```bash
git commit -m "Updated donation page"
```

---

# Step 13: Push Branch

```bash
git push origin feature-name
```

Example:

```bash
git push origin donation-page
```

---

# Step 14: Create Pull Request

Go to GitHub.

Open the repository.

Click

```
Compare & Pull Request
```

↓

Click

```
Create Pull Request
```

↓

Add title and description.

↓

Click

```
Create Pull Request
```

---

# Step 15: Merge Pull Request

Repository owner:

Click

```
Merge Pull Request
```

↓

Click

```
Confirm Merge
```

---

# Step 16: Delete Branch

Delete local branch:

```bash
git branch -d feature-name
```

Delete remote branch:

```bash
git push origin --delete feature-name
```

---

# Step 17: Update Main Branch

```bash
git checkout main
```

```bash
git pull origin main
```

---

# Step 18: View Commit History

```bash
git log
```

Short history:

```bash
git log --oneline
```

Graph:

```bash
git log --graph --decorate --all
```

---

# Step 19: View File Changes

```bash
git diff
```

---

# Step 20: View Remote Repository

```bash
git remote -v
```

---

# Step 21: Add Remote

```bash
git remote add origin https://github.com/1dt24cs248/NGO.git
```

---

# Step 22: Change Remote URL

```bash
git remote set-url origin https://github.com/1dt24cs248/NGO.git
```

---

# Step 23: Remove Remote

```bash
git remote remove origin
```

---

# Step 24: Merge Branch

```bash
git checkout main
```

```bash
git merge feature-name
```

---

# Step 25: Rebase

```bash
git pull --rebase origin main
```

Continue rebase:

```bash
git add .
```

```bash
git rebase --continue
```

Abort rebase:

```bash
git rebase --abort
```

---

# Step 26: Resolve Merge Conflict

After editing conflicting files:

```bash
git add .
```

```bash
git commit -m "Resolved merge conflict"
```

---

# Step 27: Abort Merge

```bash
git merge --abort
```

---

# Step 28: Undo Last Commit

Keep files:

```bash
git reset --soft HEAD~1
```

Delete commit completely:

```bash
git reset --hard HEAD~1
```

---

# Step 29: Revert Commit

```bash
git revert COMMIT_ID
```

---

# Step 30: Stash Changes

Save work:

```bash
git stash
```

View stash:

```bash
git stash list
```

Restore:

```bash
git stash pop
```

---

# Step 31: Tags

Create tag:

```bash
git tag v1.0
```

Push tag:

```bash
git push origin v1.0
```

---

# Step 32: Contributors Workflow

"""Every contributor should follow this order:

```text
git pull origin main
        ↓
git checkout -b feature-name
        ↓
Make Changes
        ↓
git status
        ↓
git add .
        ↓
git commit -m "Describe changes"
        ↓
git push origin feature-name
        ↓
Create Pull Request
        ↓
Merge Pull Request
        ↓
Delete Branch
        ↓
git checkout main
        ↓
git pull origin main
```
""""
---

# Step 33: Common Errors

## Push Rejected

```bash
git pull --rebase origin main
```

Then:

```bash
git push origin feature-name
```

---

## Merge Conflict

Resolve the conflict.

Then:

```bash
git add .
```

```bash
git commit -m "Resolved merge conflict"
```

Push:

```bash
git push origin feature-name
```

---

## Check Git Configuration

```bash
git config --global --list
```

---

## Repository Structure

```
NGO
│
├── index.html
├── apply.html
├── theme.css
├── announcment.js
├── Images
├── README.md
└── CONTRIBUTING.md
```

---

# Happy Coding!

#Thank you for contributing to the NGO Project.