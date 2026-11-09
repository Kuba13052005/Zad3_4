---
name: Replit workflow naming
description: Notes on naming workflows created through Replit's workflow configuration.
---

Use a descriptive name for the actual configured workflow. The workflow configuration callback rejects `Project` as a reserved or ambiguous name, even when `.replit` uses `Project` as the Run button alias and forwards it to a named workflow.

**Why:** The generic label is not accepted as a workflow's own name.

**How to apply:** Create a descriptive workflow such as `Run Java Example` and keep or configure the Run button alias to invoke it.
