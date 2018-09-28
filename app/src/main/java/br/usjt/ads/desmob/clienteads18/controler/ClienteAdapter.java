package br.usjt.ads.desmob.clienteads18.controler;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.usjt.ads.desmob.clienteads18.R;
import br.usjt.ads.desmob.clienteads18.model.Cliente;
import br.usjt.ads.desmob.clienteads18.model.Util;

public class ClienteAdapter extends BaseAdapter {
    private ArrayList<Cliente> clientes;
    private Context context;

    public ClienteAdapter(ArrayList<Cliente> clientes, Context context) {

        this.clientes = clientes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return clientes.size();
    }

    @Override
    public Object getItem(int i) {
        return clientes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override

    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View linha = inflater.inflate(R.layout.linha_cliente, viewGroup, false);
        ImageView fotoCliente = (ImageView) linha.findViewById(R.id.foto_cliente);

        TextView linhaNome = (TextView) linha.findViewById(R.id.linha_nome);
        TextView linhaDetalhe = (TextView) linha.findViewById(R.id.linha_detalhe);

        Cliente cliente = clientes.get(i);


        linhaNome.setText(cliente.getNome());
        linhaDetalhe.setText((cliente.getDiretor() + " - " + cliente.getData()));



        Drawable drawable = Util.getDrawable(context, cliente.getFigura());
        fotoCliente.setImageDrawable(drawable);

        return linha;
    }
}