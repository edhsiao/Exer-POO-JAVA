package facade;

import java.util.Vector;

public interface MatriculaGUI {

    public Vector  myList;

  public void matricular( codAluno,  codCurso,  turma)
  {
	  if (turma == null)
	  {
			turma = new Turma();
			Curso c = Escola.getCurso(codCurso);
			turma.setCurso(c);
			}
			Aluno rex = Escola.getAluno(codAluno);
			turma.addAluno(rex);
  }

  public void exibirStatus(turma)
  {
	  cursoFld.setText(turma.getCurso().getNome());
		Aluno[] alunos = turma.getAlunos();
		for (int i = 0; i < alunos.length; i++) {
		displayList.add(alunos[i]);
	}
  }


